package main

public class Unit {
    def ratio
    String name

    static def convertUnit(Money m, Unit newUnit) {
        def factor = ratioTable[m.unit.ratio][newUnit.ratio]
        if(factor) {
            return m.value * factor
        }
        else {
            return m.value / ratioTable[newUnit.ratio][m.unit.ratio]
        }
    }
    static ratioTable = [
    //  eur,    usd,    jpy,    gpb,    sek
    [   1,      1.37,   141.46, 0.83,   8.98    ],    // eur
    [   0.73,   1,      103.14, 0.60,   6.55    ],    // usd
    [   0.01,   0.01,   1,      0.01,   0.06    ],    // jpy
    [   1.21,   1.66,   170.9,  1,      10.85   ],    // gpb
    [   0.11,   0.15,   15.75,  0.09,   1       ],    // sek
    ]

    public static final eur = new Unit(ratio : 0, name : "Euro")
    public static final usd = new Unit(ratio : 1, name : "Amerikanska dollar")
    public static final jpy = new Unit(ratio : 2, name : "Japanska yen")
    public static final gbp = new Unit(ratio : 3, name : "Pund sterling")
    public static final sek = new Unit(ratio : 4, name : "Svenska kronor")
}



