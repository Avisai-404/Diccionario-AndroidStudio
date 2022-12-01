package gerard.g.suarez.webap.model

class QuoteProvider {
//en esta parte se guarda la informacion que se quiere mostrar
    //funciona como una base de datos basicamente
    companion object {
        fun random(): QuoteModel {
            val position = (0..3).random()
            return quotes[position]
        }
        //estos son los mensajes que seran mostrados en la pantalla
        private val quotes = listOf(
            QuoteModel(
                quote = "Uts'aykun ajnoxi'pap jink'in jumka' uchen ch'uyu' tuchëmp'elib ka' uyële' ke ya' uxe të ajtë chëmo tan kaj.",
                Author = "Cuenta el abuelo que cuando el duende chifla por los cuatro puntos cardinales, avisa que alguien del pueblo morirá"
            ),
            QuoteModel(
                quote = "Uyubkan nëmte' t'ok noj uk'e tuba untu wichu'.",
                Author = "Lo acompaña el ladrido fuerte de un perro."
            ),
            QuoteModel(
                quote = " Jini na'piyo'jo, ke ya'ajo' ch'ijka'të xëmba, ulaj pasejo'të ankëre t'ok bak'ët, mach uchëninte kaxkune ubëk'tesan, sek'unejo' uchënen ajjchëme.",
                Author= "Las gallinas, estando tranquilas caminando, corren despavoridas, nadie ve quién las asusta, más si ven a la muerte. "
            ),
            QuoteModel(
                quote = " Uyëlkan ke ajyumka' une ulaj ëlë, no'onla mach muyila kwa'uyële'.",
                Author = " Se dice que el duende es el que les avisa a todos ellos, pero muchos no interpretamos el mensaje."
            )
        )
    }
}