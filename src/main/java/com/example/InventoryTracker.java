package com.example;

public class InventoryTracker {
    private int stockLevel;
    
    public InventoryTracker(int initialStock) {
        this.stockLevel = initialStock;
    }
    
    public int getStockLevel() {
        return stockLevel;
    }
    
    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }
}
