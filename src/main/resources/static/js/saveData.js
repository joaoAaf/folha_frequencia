

function salvar() {
    let checkSalvar = document.getElementById('checkSalvar')

    if (checkSalvar.checked) {
        localStorage.setItem('data', JSON.stringify(dataDto))
    }
    console.log(localStorage.getItem('data'))
}







/*localStorage.setItem('data', JSON.stringify(dataDto))

const data = localStorage.getItem('data')*/
