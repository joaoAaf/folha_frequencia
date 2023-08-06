function criaDia(dia) {
    let tr = document.createElement('tr')
    let num = dia[2].getDay()
    for (j = 0; j < dia.length; j++) {
        let td = document.createElement('td')
        if (j == 2) {
            td.innerHTML = dia[2].getDate()
        }
        else {
            switch (num) {
                case 0:
                    td.innerHTML = "DOMINGO"
                case 6:
                    td.innerHTML = "SABADO"
                default:
                    td.innerHTML = opcaoHorario(dia[j])
            }
        }
        tr.appendChild(td)
    }
    return tr
}

function opcaoHorario(hora) {
    if (repetir == true || (aleatorio == true && repetir == true)) {
       return hora.toLocaleTimeString('pt-BR', { hour: '2-digit', minute: '2-digit' })
    }
    else if (aleatorio == true) {
        //escrever codigo para aleatorio
        return ""
    }
    else {
        return ""
    }
}

let tbody = document.getElementById('tboby_frequency')

const ultimoDia = new Date(dia[0])
ultimoDia.setMonth(ultimoDia.getMonth() + 1)
ultimoDia.setDate(ultimoDia.getDate() - 1)

dia.splice(2, 0, dia[0])
const horasDia = []

for (i = 0; i < 5; i++) {
    horasDia.push(new Date(dia[i]))
}

for (i = 1; i <= ultimoDia.getDate(); i++) {
    tbody.appendChild(criaDia(horasDia))
    horasDia[2].setDate(horasDia[2].getDate() + 1)
}





