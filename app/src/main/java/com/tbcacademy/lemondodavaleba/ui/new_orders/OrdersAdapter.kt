package com.tbcacademy.lemondodavaleba.ui.new_orders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.tbcacademy.lemondodavaleba.R
import com.tbcacademy.lemondodavaleba.databinding.ItemNewOrderBinding
import com.tbcacademy.lemondodavaleba.model.NewOrder

class OrdersAdapter : RecyclerView.Adapter<OrdersAdapter.OrdersViewHolder>() {

    private var items: List<NewOrder> = ArrayList()


    inner class OrdersViewHolder(private val binding: ItemNewOrderBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private lateinit var model: NewOrder

        fun bind() {
            model = items[adapterPosition]
            itemView.apply {
                binding.apply {
                    tvNumber.text = "#${model.number}"
                    tvDishName.text = model.dishName
                    tvDestination.text = model.destination
                    tvQuantity.text = "x${model.quantity}"
                    tvPrice.text = "${model.price} j"
                    progressBarr.progress = model.progress

                    when (model.progress) {
                        in 0..25 -> progressBarr.progressDrawable =
                            ResourcesCompat.getDrawable(
                                resources,
                                R.drawable.custom_progress_red,
                                null
                            )
                        in 25..50 -> progressBarr.progressDrawable =
                            ResourcesCompat.getDrawable(
                                resources,
                                R.drawable.custom_progress_orange,
                                null
                            )
                        else -> progressBarr.progressDrawable =
                            ResourcesCompat.getDrawable(
                                resources,
                                R.drawable.custom_progress_green,
                                null
                            )
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = OrdersViewHolder(
        ItemNewOrderBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: OrdersViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = items.size

    fun submitList(orderList: List<NewOrder>) {
        items = orderList
    }
}