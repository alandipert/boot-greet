(ns alandipert.greet
  {:boot/export-tasks true}
  (:require [boot.from.io.aviso.ansi :as ansi]
            [boot.core :as core]
            [boot.util :as util]
            [clojure.java.io :as io])
  (:import com.github.lalyos.jfiglet.FigletFont))

(core/deftask greet
  "Print a holiday message."
  []
  (core/with-pre-wrap [fs]
    (let [snowman (slurp (io/resource "alandipert/greet/snowman.txt"))]
      (println snowman)
      (println (ansi/bold-red (FigletFont/convertOneLine "Happy")))
      (println (ansi/bold-green (FigletFont/convertOneLine "Holidays")))
      (println (ansi/italic "Thanks for making 2015 a great year for Boot!"))
      (println (ansi/italic "We wish you a holiday season of peace and joy."))
      (println (ansi/italic "- Alan Dipert & Micha Niskin"))
      fs)))

