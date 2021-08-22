package com.shestakov.pictureoftheday.ui.recycler_activity

import com.shestakov.pictureoftheday.ui.recycler_activity.model.Data

interface OnListItemClickListener {
    fun onItemClick(data: Data)
}