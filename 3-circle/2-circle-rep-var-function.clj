;;清除
(reset)

;;
(def steps 3)
(def angle 3)

;; 設定填充顏色
(set-fill "Blue") 

;; function 函數 (用來包住某一區塊的程式碼，使該區塊自成一塊新的邏輯結構)

;; defn = 定義函數
(defn circle [steps angle]
  (filled
    (rep 120
      (forward steps)
      (left angle)))))

;; 啟動函數 (invocation of function)
(circle steps angle)
