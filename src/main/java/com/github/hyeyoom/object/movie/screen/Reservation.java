package com.github.hyeyoom.object.movie.screen;

import com.github.hyeyoom.object.movie.currency.Money;
import com.github.hyeyoom.object.movie.user.Customer;

public class Reservation {

    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reservation{");
        sb.append("customer=").append(customer);
        sb.append(", screening=").append(screening);
        sb.append(", fee=").append(fee);
        sb.append(", audienceCount=").append(audienceCount);
        sb.append('}');
        return sb.toString();
    }
}
