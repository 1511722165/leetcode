select  actor_id,director_id from (select actor_id,director_id,count(director_id) as c from ActorDirector
                                   group by actor_id,director_id)
                                      t where c>=3