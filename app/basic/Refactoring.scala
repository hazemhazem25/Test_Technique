package com.particeep.test.basic

/**
 * What is the complexity of the function : n+1
 *
 * Refactor it to be a better function
 */
object Refactoring {

  case class File(
    name:     String,
    category: String
  )

  def getCategories(files: List[File]): List[String] = {
    val categories: List[String] = List()

    if(files != null) {
      for(file <- files) {
        categories :+ files.filter(file => !categories.contains(file.category))
      }
    }

    return categories
  }
}
