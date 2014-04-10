package main

use(MoneyCategory.class) {
    def euro = 0.eur
    def dollar = 0.usd
    def yen = 0.jpy
    def pund = 0.gbp
    def kronor = 0.sek
    println 1.eur+1.usd
    println 1.eur+1.eur
    println 1.gbp*10.eur
    println 1.sek+10.eur+1.jpy
    println 20.jpy**1.eur
    println 1.jpy*10.sek
    println 1000.usd-10.sek
    println 1.jpy+1.sek+1.usd+1.eur+1.gbp
    println kronor+1.eur==(8.98.sek)
    println 8.98.sek
    println kronor+1.eur
    println 10.sek/1.gbp
}