package com.tbcacademy.lemondodavaleba.ui.ordered

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tbcacademy.lemondodavaleba.databinding.ItemOrderedBinding
import com.tbcacademy.lemondodavaleba.model.Ordered

class OrderedDishesAdapter : RecyclerView.Adapter<OrderedDishesAdapter.OrdersViewHolder>() {

    private var items: List<Ordered> = ArrayList()

    inner class OrdersViewHolder(private val binding: ItemOrderedBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private lateinit var model: Ordered
        fun bind() {

            model = items[adapterPosition]

            itemView.apply {
                binding.apply {
                    tvNumber.text = "#${model.number}"
                    tvDishName.text = model.dishName
                    tvDestination.text = model.destination
                    tvDeliveryTime.text = "${model.deliveryTime}min"
                    quantity.text = "x${model.quantity}"
                    price.text = "${model.price} j"

                    val minutes = model.preparationTimeSec / 60
                    val seconds = model.preparationTimeSec % 60
                    val time = minutes - seconds / 60

                    tvTime.text = "0$time:$seconds"
                    progressBar.progress = model.preparationTimeSec

                }

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = OrdersViewHolder(
        ItemOrderedBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: OrdersViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = items.size

    fun submitList(orderList: List<Ordered>) {
        items = orderList
    }
}