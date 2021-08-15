package com.tbcacademy.lemondodavaleba.model

class DataSource {

    companion object {

        fun createDataSet(): ArrayList<NewOrder> {
            val list = ArrayList<NewOrder>()
            list.add(
                NewOrder(
                    22,
                    "ვის ბურგერი",
                    "საბურთალო",
                    4,
                    56.30,
                    100
                )
            )

            list.add(
                NewOrder(
                    22,
                    "ვის ბურგერი",
                    "საბურთალო",
                    1,
                    12.80,
                    50
                )
            )

            list.add(
                NewOrder(
                    22,
                    "ვის ბურგერი",
                    "საბურთალო",
                    1,
                    12.80,
                    20
                )
            )

            return list

        }

        fun createOrderedDishesDataset() : ArrayList<Ordered> {
            val list = ArrayList<Ordered>()

            list.add(
                Ordered(
                    19,
                    "ვის ბურგერი",
                    "საბურთალო",
                    4,
                    56.30,
                    14,
                    222
                )
            )

            list.add(
                Ordered(
                    19,
                    "ვის ბურგერი",
                    "საბურთალო",
                    4,
                    56.30,
                    14,
                    160
                )
            )


            list.add(
                Ordered(
                    321,
                    "ბურგერი",
                    "დიღომი",
                    4,
                    56.30,
                    14,
                    80
                )
            )

            list.add(
                Ordered(
                    39,
                    "ბურგერი",
                    "დიღომი",
                    4,
                    56.30,
                    14,
                    30
                )
            )

            list.add(
                Ordered(
                    30,
                    "ბურგერი",
                    "დიღომი",
                    4,
                    56.30,
                    14,
                    100
                )
            )

            return list

        }

    }

}