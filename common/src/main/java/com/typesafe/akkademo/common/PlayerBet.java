/**
 *  Copyright (C) 2011-2012 Typesafe, Inc <http://typesafe.com>
 */
package com.typesafe.akkademo.common;

public class PlayerBet {
    private final int id;
    private final Bet bet;

    public PlayerBet(int id, Bet bet) {
        this.id = id;
        this.bet = bet;
    }

    public int getId() {
        return id;
    }

    public Bet getBet() {
        return bet;
    }
}