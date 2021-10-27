package com.particeep.test.basic

/**
 * This is basic language questions so don't use external library or build in function
 */
object BasicScala {

  /**
   * Encode parameter in url format
   *
   * Example:
   *
   * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
   * output : "?sort_by=name&order_by=asc&user_id=12"
   *
   * input  : Map()
   * output : ""
   */
  def encodeParamsInUrl(params: Map[String, String]): String = {
	params.foreach((map: (String, String)) => println("?"+ map._1 + "=" + map._2 + "&"))
  }

  /**
   * Test if a String is an email
   */

	object verficationMail {
		def apply(user: String, domain: String) = user +"@"+ domain

		def unapply(word: String): Option[(String, String)] = {
			val parts = word split "@"
			if (parts.length == 2) Some(parts(0), parts(1)) else None
		}
	}
	def isEmail(maybeEmail: String): Boolean = {
		s match {
		  case verficationMail (user, domain) => println(user +" AT "+ domain)
		  case _ => println("adress email invalid")
		}
	}
	

  /**
   * Compute i ^ n
   *
   * Example:
   *
   * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
   * output : 8
   *
   * input : (i = 99, n = 38997)
   * output : 1723793299
   */
	def power(i: Int, n: Int): Int = {
           result = 1 
           for (var x <- 1 to n ) {
                 result = result*i 
          }
         
        println("The value of "+i+" to the power of "+n+" is "+ result )
    }
}

