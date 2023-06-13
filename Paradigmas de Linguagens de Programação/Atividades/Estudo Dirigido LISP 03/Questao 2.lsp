(defun verificar-palindromo (frase)
  (let* ((frase-limpa (remove #\Space (string-downcase frase)))
         (frase-invertida (reverse frase-limpa)))
    (if (equal frase-limpa frase-invertida)
        (format t "A frase ~a e um palindromo." frase)
        (format t "A frase ~a nao e um palindromo." frase))))


(let ((frase (read-line)))
  (verificar-palindromo frase))