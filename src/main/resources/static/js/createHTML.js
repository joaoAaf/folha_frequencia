function geraHtml() {
    let frequency = document.getElementById('frequency')
    let stringHtml = frequency.innerHTML
    let table1 = document.getElementById('table_frequency1')
    let table2 = document.getElementById('table_frequency2')
    frequency.removeChild(table1)
    frequency.removeChild(table2)
    let p = document.createElement('p')
    p.textContent = stringHtml
    frequency.appendChild(p)
}