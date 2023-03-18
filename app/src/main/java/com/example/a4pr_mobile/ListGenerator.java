package com.example.a4pr_mobile;

import java.util.ArrayList;
import java.util.List;

public class ListGenerator {
    public static List<Item> gen(int imageId, String prefix, int amount) {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            Item it = new Item(prefix + " #" + (i + 1), imageId);
            items.add(it);
        }
        return items;
    }
}
