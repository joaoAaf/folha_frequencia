function geraHtml() {
    let frequency = document.getElementById('frequency')
    let stringHtml = frequency.innerHTML
    navigator.clipboard.writeText(stringHtml)
    alerta()
}