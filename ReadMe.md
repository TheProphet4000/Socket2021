- Serveren lytter på port 8000
- Serveren skriver hvornår den blev startet. Hvor den så vil lave en ny tråd (med en I/O stream), for hver client der opretter forbindelse, med serveren.
- Derefter, vil serveren så modtage modtage en double, der bruges til udregningen af arealet, af en cirkel. Denne udregning, vil så blive sendt tilbage til client, i form af et TextArea.
- For hver tråd, vil den så starte med at lytte, med .start()