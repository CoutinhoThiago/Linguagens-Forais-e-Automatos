(defun lista-ordenada (lista)
  (let ((ordenada (sort lista #'<)))
    (equal lista ordenada)))

(let ((lista (read)))
  (if (lista-ordenada lista)
      (format t "A lista ~a esta ordenada" lista)
      (format t "A lista ~a nao esta ordenada" lista)))


; Exemplo
; (1 5 6 7 9 812 22)
