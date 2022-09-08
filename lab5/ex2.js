var movie = { title: "Black Hawk Down", duration: 144, actors: ["Josh Hartnett", "Eric Bana", "Tom Hardy", "Ewan McGregor", "Orlando Bloom"] }



function displayMovie(movie) {

   




    return movie.title + " running time is " + movie.duration + " minutes. Starring: " + movie.actors.toString().replace(/,/g,", ")

}



console.log(displayMovie(movie))