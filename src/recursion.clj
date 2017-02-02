(ns recursion)

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll) (product (rest coll)))
  )
)

(defn singleton? [coll]
  (if (empty? coll) false
    (if (empty?(rest coll)) true false)
  )
)

(defn my-last [coll]
  (last coll)
)

(defn max-element [a-seq]
  (if (empty? a-seq) nil
    (apply max a-seq)
  )
)

(defn seq-max [seq-1 seq-2]
  (let [eka (count seq-1)
       toka (count seq-2)]
  (if (> eka toka) seq-1 seq-2)

  )
)

(defn longest-sequence [a-seq]
  (cond
   (empty? a-seq) nil
   (singleton? a-seq) (first a-seq)
   :else (seq-max (first a-seq) (longest-sequence (rest a-seq)))
  )
)

(defn my-filter [pred? a-seq]
  (cond
    (empty? a-seq) a-seq
    (pred? (first a-seq)) (cons (first a-seq) (my-filter pred? (rest a-seq)))
    :else (my-filter pred? (rest a-seq))))

(defn sequence-contains? [elem a-seq]
(cond
  (empty? a-seq) false
  (= elem (first a-seq)) true
  :else (sequence-contains? elem (rest a-seq))))

(defn my-take-while [pred? a-seq]
  (cond
    (empty? a-seq) a-seq
    (pred? (first a-seq)) (cons (first a-seq) (my-take-while pred? (rest a-seq)))
    :else ()))

(defn my-drop-while [pred? a-seq]
  (cond
    (empty? a-seq) a-seq
    (pred? (first a-seq)) (my-drop-while pred? (rest a-seq))
    :else a-seq))

(defn seq= [a-seq b-seq]
  (cond
  (and (empty? a-seq)
       (empty? b-seq)) true
  (= a-seq b-seq) (seq= (rest a-seq)
                        (rest b-seq))
   :else false))

(defn my-map [f seq-1 seq-2]
  (cond
  (or (empty? seq-2) (empty? seq-1)) '()
  :else
  (cons (f (first seq-1) (first seq-2))
  (my-map f (rest seq-1) (rest seq-2)))))

(defn power [n k]
  (if (zero? k) 1
    (* n (power n (dec k)))
  )
)

(defn fib [n]
  (cond
   (zero? n) 0
   (== n 1) 1
   :else
   (+ (fib (- n 1)) (fib (- n 2)))))

(defn my-repeat [how-many-times what-to-repeat]
  [:-])

(defn my-range [up-to]
  [:-])

(defn tails [a-seq]
  [:-])

(defn inits [a-seq]
  [:-])

(defn rotations [a-seq]
  [:-])

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take [n coll]
  [:-])

(defn my-drop [n coll]
  [:-])

(defn halve [a-seq]
  [:-])

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])

