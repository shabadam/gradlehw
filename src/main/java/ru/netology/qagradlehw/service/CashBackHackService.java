package ru.netology.qagradlehw.service;
public class CashBackHackService {
        private final int boundary = 1000;

        public int remain(int amount) {
            return boundary - amount % boundary;
        }
    }
