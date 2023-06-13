(defun calcular-fatorial (numero)
  (cond
    ((not (integerp numero)) (format t "O numero deve ser inteiro"))
    ((<= numero 0) (format t "O numero deve ser maior do que zero"))
    (t
      (let ((fatorial 1) (i 1))
        (loop while (<= i numero) do
          (setf fatorial (* fatorial i)
                i (+ i 1)))
        (format t "O fatorial de ~a e ~a" numero fatorial)))))

(let ((numero (parse-integer (read-line))))
  (calcular-fatorial numero))