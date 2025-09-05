function convertBraille() {
    const input = document.getElementById("inputText").value.toLowerCase();
    const brailleMap = {
        'a': '100000', 'b': '101000', 'c': '110000',
        'd': '110100', 'e': '100100', 'f': '111000',
        'g': '111100', 'h': '101100', 'i': '011000',
        'j': '011100', ' ': '000000'
    };

    let output = '';
    for (let char of input) {
        output += brailleMap[char] ? brailleMap[char] + ' ' : '?????? ';
    }

    document.getElementById("outputText").value = output.trim();
}
