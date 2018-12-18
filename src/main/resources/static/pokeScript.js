$(document).ready(function()
{
    var listPokemons;
    $.get("http://localhost:8090/listePokemons", function (data)
    {
        listPokemons = data;
        data.forEach(function (pokemon)
        {
        //On affiche la liste des pokémons dans la première liste déroulante
            $("#listPokemon1").append("<option value='" + pokemon.nomPokemonPok+ "'>" + pokemon.nomPokemonPok+ "</option>");

         });
    });
// A chaque changement de pokemon on récupère le pokémon selectionné
     $("#listPokemon1").change (function(e){
        var nomP = $("#listPokemon1").find(":selected").text();
        listPokemons.forEach(function (pokemon){
            if(pokemon.nomPokemonPok === nomP){
//Pour chaque pokémon sélectionné on rempli les autres listes déroulantes de ses attaques correspondantes
                pokemon.attaque.forEach(function (a){

                    $(".listAttacks1").append("<option value='" + a.nomAttaqueAt+ "'>" + a.nomAttaqueAt+ "</option>");
                    $(".listAttacks2").append("<option value='" + a.nomAttaqueAt+ "'>" + a.nomAttaqueAt+ "</option>");
                    $(".listAttacks3").append("<option value='" + a.nomAttaqueAt+ "'>" + a.nomAttaqueAt+ "</option>");
                    $(".listAttacks4").append("<option value='" + a.nomAttaqueAt+ "'>" + a.nomAttaqueAt+ "</option>");
                });
            }
        });

     });
});
