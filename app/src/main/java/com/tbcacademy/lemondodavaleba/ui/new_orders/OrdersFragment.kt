package com.tbcacademy.lemondodavaleba.ui.new_orders

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tbcacademy.lemondodavaleba.databinding.OrdersFragmentBinding
import com.tbcacademy.lemondodavaleba.model.DataSource

class OrdersFragment : Fragment() {

    private lateinit var binding: OrdersFragmentBinding
    private lateinit var ordersAdapter: OrdersAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = OrdersFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        addDataSet()
    }

    private fun addDataSet() {
        val data = DataSource.createDataSet()
        ordersAdapter.submitList(data)
    }


    private fun setupRecyclerView() = binding.recyclerView.apply {
        layoutManager = LinearLayoutManager(requireContext())
        ordersAdapter = OrdersAdapter()
        adapter = ordersAdapter
    }

}