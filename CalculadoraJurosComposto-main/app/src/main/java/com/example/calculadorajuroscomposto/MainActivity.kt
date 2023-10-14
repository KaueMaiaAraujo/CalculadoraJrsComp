package com.example.calculadorajuroscomposto

import java.util.Scanner
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)

    print("Informe o principal (valor inicial): ")
    val principal = scanner.nextDouble()

    print("Informe a taxa de juros anual (em decimal): ")
    val taxaJurosAnual = scanner.nextDouble()

    print("Informe o número de vezes que o juro é composto por ano: ")
    val vezesComposto = scanner.nextInt()

    print("Informe o número de anos: ")
    val anos = scanner.nextInt()

    val montante = calcularMontante(principal, taxaJurosAnual, vezesComposto, anos)
    val jurosTotais = montante - principal

    println("Montante final após $anos anos: $montante")
    println("Juros totais ganhos: $jurosTotais")
}

fun calcularMontante(principal: Double, taxaJurosAnual: Double, vezesComposto: Int, anos: Int): Double {
    val taxaJurosPeriodo = taxaJurosAnual / vezesComposto
    val nPeriodos = vezesComposto * anos
    return principal * (1 + taxaJurosPeriodo).pow(nPeriodos)
}