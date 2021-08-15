package com.tbcacademy.lemondodavaleba.ui.ordered

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tbcacademy.lemondodavaleba.databinding.OrderedDishFragmentBinding
import com.tbcacademy.lemondodavaleba.model.DataSource

class OrderedDishFragment : Fragment() {

    private lateinit var binding: OrderedDishFragmentBinding
    private lateinit var ordersAdapter: OrderedDishesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = OrderedDishFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        addDataSet()
    }

    private fun addDataSet() {
        val data = DataSource.createOrderedDishesDataset()
        ordersAdapter.submitList(data)

    }


    private fun setupRecyclerView() = binding.recyclerView.apply {
        layoutManager = LinearLayoutManager(requireContext())
        ordersAdapter = OrderedDishesAdapter()
        adapter = ordersAdapter
    }

}