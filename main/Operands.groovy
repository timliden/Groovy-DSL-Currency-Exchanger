package main

public class Money implements Comparable {
    BigDecimal value
    Unit unit

    Money plus(Money operand) {
        def newValue = this.value + Unit.convertUnit(operand, this.unit)
        new Money(value: newValue, unit : this.unit)
    }

    Money minus(Money operand) {
        def newValue = this.value - Unit.convertUnit(operand, this.unit)
        new Money(value: newValue, unit : this.unit)
    }

    Money div(Money operand) {
        def newValue = this.value / Unit.convertUnit(operand, this.unit)
        new Money(value: newValue, unit : this.unit)
    }

    Money multiply(Money operand) {
        def newValue = this.value * Unit.convertUnit(operand, this.unit)
        new Money(value: newValue, unit : this.unit)
    }

    Money power(Money operand) {
        def newValue = this.value ** Unit.convertUnit(operand, this.unit)
        new Money(value: newValue, unit : this.unit)
    }

    int compareTo(other) {
        if(this.unit == other.unit) {
            return this.value <=> other.value
        }
        return this.value <=> Unit.convertUnit(other, this.unit)
    }
    String toString() {
        "$value $unit.name"
    }
}