document.getElementById("search").addEventListener("submit", function(event) {
    event.preventDefault();
    
    let query = document.getElementById("search-box").value;
    
    if (query.trim() !== "") {
        document.getElementById("resultados").innerHTML = `Resultados para: <strong>${query}</strong>`;
    } else {
        document.getElementById("resultados").innerHTML = "Digite algo para pesquisar!";
    }
});
