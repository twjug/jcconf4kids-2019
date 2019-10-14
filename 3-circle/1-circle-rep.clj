;; 圓形

(reset) ;; 清除

;; Triangle 120 * 3 = 360
;; Square    90 * 4 = 360
;; Circle     X * Y = 360

;; rep * left = 360
;; left and forward must the same
(rep 120
  (forward 3)
  (left 3))
