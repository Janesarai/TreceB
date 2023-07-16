package com.example.treceb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.DisplayPhoto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
data class Heroe(val superHeroe:String, val publisher:String, val realName:String, val photo: String)

fun main(){

    var cant: Int = 1

    var heroes = mutableListOf<Heroe>()

    while (cant==1) {

        println("Escribe el nombre")
        var nombre = readln()

        println("Escribe el publisher")
        var publisher = readln()

        println("Escribe el real Name")
        var realName = readln()

        println("photo")
        var photo = realName

        heroes.add(Heroe(nombre,publisher,realName,photo))
        println("Ingrese 1 para seguir")
        cant = readln().toInt()



    }
    for (h in heroes){
        println("$h")
    }
}