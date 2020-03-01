package com.github.hyeyoom.object.movie;

import com.github.hyeyoom.object.movie.currency.Money;
import com.github.hyeyoom.object.movie.discount.AmountDiscountPolicy;
import com.github.hyeyoom.object.movie.discount.PeriodCondition;
import com.github.hyeyoom.object.movie.discount.SequenceCondition;
import com.github.hyeyoom.object.movie.screen.Movie;
import com.github.hyeyoom.object.movie.screen.Reservation;
import com.github.hyeyoom.object.movie.screen.Screening;
import com.github.hyeyoom.object.movie.user.Customer;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MovieApplication {

    public static void main(String[] args) {
        final Movie avatar = new Movie(
                "Avatar",
                Duration.ofMillis(120),
                Money.wons(10000),
                new AmountDiscountPolicy(
                        Money.wons(800),
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59))
                )
        );
        System.out.println(avatar.getFee());
        final Screening screening = new Screening(avatar, 1, LocalDateTime.now());
        final Reservation reserve = screening.reserve(new Customer(), 4);
        System.out.println(reserve);
    }
}
