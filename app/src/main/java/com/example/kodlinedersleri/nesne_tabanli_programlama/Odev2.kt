package com.example.kodlinedersleri.nesne_tabanli_programlama

// 1- Parametre olarak girilen dereceyi fahrenheit'a dönüştürdükten sonra geri döndüren
// bir metod yazınız. F = C * 1.8 +32

class Odev2 {
    fun soru1(derece: Int) {
        val fahrenheit = ((derece * 1.8) + 32)
        println("$derece Celsius = $fahrenheit Fahrenheit")
    }

    // kenarları parametre olarak girilen ve dikdörtgenin çevresini hesaplayan bir metod yazınız

    fun soru2(kısaKenar: Int, uzunKenar: Int) {
        val dikdorgeninCevresi = (2 * uzunKenar) + (2 * kısaKenar)
        println("$dikdorgeninCevresi")
    }

    //parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri döndüren metodu yazınız

    fun soru3(sayi: Int) {
        var faktoriyel = 1
        for (i in 1..sayi) {
            faktoriyel *= i
        }
        println("$sayi! = $faktoriyel")
    }

    //parametre olarak girilen kelime içinde kaç adet a harfi olduğunu gösteren bir metod yazınız

    fun soru4(kelime: String) {
        var adet = 0
        for (harf in kelime) {
            if (harf == 'a' || harf == 'A') {
                adet++
            }
        }
        println("Kelime icinde $adet adet 'a' harfi var.")
    }

    //parametre olarak girilen kenar sayısınıa göre iç acılar toplamını hesaplayıp sonucu geri
    //gönderen metod yazınız

    fun soru5(kenarSayisi: Int) {
        val icacılartoplami = ((kenarSayisi - 2) *180)
        println("$icacılartoplami")
    }

    // parametre olarak girilen gün sayısına göre maaş hesabı yapan
    // ve elde edilen değeri döndüren metod yazınız
    // 1 günde 8 saat çalışabilir
    // çalışma saat ücreti: 10 tl
    // mesai saat ücreti: 20 tl
    // 160 saat üzeri mesai sayılır

    //soru6
    fun maas(gunSayisi: Int): Int {
        val toplamSaat = gunSayisi * 8
        return if (toplamSaat <= 160) {
            toplamSaat * 10
        } else {
            val mesaiSaati = toplamSaat - 160
            (160 * 10) + (mesaiSaati * 20)
        }
    }

    // parametre olarak girilen kot miktarina gore ücreti hesaplayarak geri döndüren metodu yazınız
    // 50 GB = 100tl
    // kota asımından sonra her 1 gb 4 tl dir
    fun kotaUcreti(kotaMiktari: Double): Double {
        val kotaLimiti = 50.0  // 50 GB kota limiti
        val temelUcret = 100.0  // 50 GB için ücret
        val ekUcretPerGb = 4.0  // Kota aşımında her 1 GB için ücret

        return if (kotaMiktari <= kotaLimiti) {
            temelUcret  // Kota aşılmadıysa sadece temel ücret
        } else {
            val fazlaKota = kotaMiktari - kotaLimiti
            temelUcret + (fazlaKota * ekUcretPerGb)  // Kota aşımı için ek ücret
        }

    }





}