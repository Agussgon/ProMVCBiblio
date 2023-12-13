
window.addEventListener('load',()=>{

const contenedorAutores= document.getElementById("container-autores");

consultarAutores()

//



function consultarAutores(){

const settings={
  method:'GET'
  //headers:{}
}

fetch("http://localhost:8081/autores/todos", settings)

  .then(response => {
    if (!response.ok) {
      throw new Error("error");
    }
    return response.json();
  })

  
  .then(autores => {
    console.log(autores);
    renderizarAutores(autores)
  })
  .catch(error => {
    console.error("error", error);
  });

}
 




  function renderizarAutores(lista){

   let listadoAutores=[]

   lista.forEach(autor => {
   let templateString= `<div class="card" style="width: 18rem;">
            <!--<img src="..." class="card-img-top" alt="..."> --> 
            <div class="card-body">
                <h5 class="card-title">${autor.nombre}</h5>
                <p class="card-text">${autor.apellido}</p>
                <a href="#" class="btn btn-primary">Go somewhere</a>
            </div>
          </div>`

    listadoAutores.push(templateString) });

    contenedorAutores.innerHTML =listadoAutores 

  }

  

}) 

   