package com.hilmi.shoppinglist.ui.ShoppingList

import com.hilmi.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}