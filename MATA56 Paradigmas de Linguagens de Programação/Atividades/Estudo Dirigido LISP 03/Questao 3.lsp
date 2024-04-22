(defun fibonacci (n)
  (cond
    ((zerop n) 0)
    ((= n 1) 1)
    (t (+ (fibonacci (- n 1)) (fibonacci (- n 2))))))

(let ((n (parse-integer (read-line))))
  (format t "O ~a elemento da sequencia de Fibonacci e: ~a" n (fibonacci n)))
