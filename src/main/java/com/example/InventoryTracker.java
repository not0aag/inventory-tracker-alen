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
    
    // New method added
    public boolean checkStockLevel(int threshold) {
        return stockLevel >= threshold;
    }
    
    // Second new method added
    public void alertLowStock(int threshold) {
        if (stockLevel < threshold) {
            System.out.println("Alert: Stock level is low! Current: " + stockLevel);
        }
    }
}
