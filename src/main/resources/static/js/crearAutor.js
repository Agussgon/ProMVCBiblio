// elementos html del dom 

const nombreIngresado= document.getElementById("nombre")
const apellidoIngresado= document.getElementById("apellido")
const btnRegistro=document.getElementById("registrar")
const containerAutor=document.getElementById("container-autor") 

// url API 
const urlPostAutores= 'http://localhost:8081/autores/crear'

/*Al hacer click sobre el botón se debe enviar el formulario para 
eso primero guardamos en un objeto autor los datos ingresados en el formulario
validamos que sean de tipo texto por el momento 
y en caso de cumplirse realizamos la solicitud POST a la url correspondiente
*/

btnRegistro.addEventListener('click',(e)=>{

e.preventDefault()
// objeto Autor a enviar
const autor={
    id:undefined,
    nombre:nombreIngresado.value,
    apellido:apellidoIngresado.value
    }

if(validarInformación(autor)){
    crearAutor(autor); 
}
})



// validar información 
function validarInformación(objetoAutor){

if(!objetoAutor.nombre|| parseInt(objetoAutor.nombre) ||
!objetoAutor.apellido || parseInt(objetoAutor.apellido) ){

    alert('datos inválidos')
return false; 
}
return true; 

}


// solicitud POST
function crearAutor(autorIngresado){

    const solicitud={
    method:'POST',
    headers:{'Content-type':'application/json'}, 
    body: JSON.stringify(autorIngresado)
    }

fetch(urlPostAutores,solicitud)
.then(response=> response.json )
.then(autorCreado => containerAutor.innerHTML =`<p>${autorCreado.id}</p>`
&& console.log(autorCreado)
)
.catch(error=>console.log(error))

} 




