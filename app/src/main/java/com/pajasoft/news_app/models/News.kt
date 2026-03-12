package com.pajasoft.news_app.models



data class Noticia(
    val title: String,
    val fecha: String,
    val img: String
)

val newsList = listOf(
    Noticia(
        title = "El presidente de EE.UU. no muestra sifnos de arrepentimiento.",
        fecha = "febrero 08 - 2024",
        img = "https://estaticos.elcolombiano.com/binrepository/849x565/69c0/780d565/none/11101/VLMA/donald-trump-salario-presidente-esta_46472239_20241107153827.jpg"
    ),
    Noticia(
        title = "Bañarse en la pscina del desierto de Cleopatra",
        fecha = "febrero 11 - 2024",
        img = "https://thumbs.dreamstime.com/z/reina-cleopatra-en-el-papiro-4052746.jpg"
    ),
    Noticia(
        title = "Gigantes tecnológicos",
        fecha = "febrero 12 - 24",
        img  = "https://elceo.com/wp-content/uploads/2021/04/empresas.jpg"
    ),
    Noticia(
        title = "El rover de Marte envia nuevas imágenes",
        fecha = "febrero 14 - 2024",
        img = "https://www.univision.com/_next/image?url=https%3A%2F%2Fuvn-brightspot.s3.amazonaws.com%2Fassets%2Fvixes%2Fr%2Frover_marte_cielo_azul_3.jpg&w=1280&q=75"
    )
)