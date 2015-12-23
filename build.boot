(set-env! :dependencies '[[com.github.lalyos/jfiglet "0.0.7"]
                          [adzerk/bootlaces "0.1.13"]]
          :resource-paths #{"src"})

(require '[adzerk.bootlaces :refer :all])

(def +version+ "2015")
(bootlaces! +version+)

(task-options!
 pom  {:project        'boot/greet
       :version        +version+
       :description    "A Holiday Greeting"
       :url            "https://github.com/alandipert/greet"
       :scm            {:url "https://github.com/alandipert/greet"}
       :license        {"Eclipse Public License" "http://www.eclipse.org/legal/epl-v10.html"}})
