package com.example.kodlinedersleri.nesne_tabanli_programlama

fun main() {
    val f = Odev2()
    f.soru1(derece=1)

    val m = Odev2()
    m.soru2(5,10)

    val x = Odev2()
    x.soru3(5)

    val y = Odev2()
    y.soru4("AndoridBootcamp")

    val o = Odev2()
    o.soru5(4)


    val w = Odev2()
    val maas = w.maas(25)  // burada sonucu bir değişkene atıyoruz
    println("Toplam maaş: $maas TL")


    val kotaMiktari = 60.0
    val ucret = kotaMiktari
    println("Toplam kota ücreti: $ucret TL")

}
