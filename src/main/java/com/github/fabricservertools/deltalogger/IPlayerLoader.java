package com.github.fabricservertools.deltalogger;

import java.util.List;
import java.util.UUID;

import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;

public interface IPlayerLoader {
  List<DefaultedList<ItemStack>> loadPlayerInventory(UUID uuid);
}