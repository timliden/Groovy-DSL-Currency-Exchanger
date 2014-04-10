package main

public class MoneyCategory {
    static Money getEur(Number n) {
        new Money(value : n, unit : Unit.eur)
    }
    static Money getEur(Money m) {
        new Money(length : Unit.convertUnit(m, Unit.eur), unit : Unit.eur)
    }

    static Money getUsd(Number n) {
        new Money(value : n, unit : Unit.usd)
    }
    static Money getUsd(Money m) {
        new Money(length : Unit.convertUnit(m, Unit.usd), unit : Unit.usd)
    }

    static Money getJpy(Number n) {
        new Money(value : n, unit : Unit.jpy)
    }
    static Money getJpy(Money m) {
        new Money(length : Unit.convertUnit(m, Unit.jpy), unit : Unit.jpy)
    }

    static Money getGbp(Number n) {
        new Money(value : n, unit : Unit.gbp)
    }
    static Money getGbp(Money m) {
        new Money(length : Unit.convertUnit(m, Unit.gbp), unit : Unit.gbp)
    }

    static Money getSek(Number n) {
        new Money(value : n, unit : Unit.sek)
    }
    static Money getSek(Money m) {
        new Money(length : Unit.convertUnit(m, Unit.sek), unit : Unit.sek)
    }
}
