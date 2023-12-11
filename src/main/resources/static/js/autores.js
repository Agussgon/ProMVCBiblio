
let parrafoAutores= document.getElementById("autores");


fetch("http://localhost:8081/autores/todos")
  .then(response => {
    if (!response.ok) {
      throw new Error("error");
    }
    return response.json();
  })
  .then(data => {
    console.log("datos", data);
  })
  .catch(error => {
    console.error("error", error);
  });