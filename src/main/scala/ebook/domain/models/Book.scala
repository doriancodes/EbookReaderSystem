package ebook.domain.models

/**
  * Created by aloisia.davi on 07.08.17.
  */

trait Book extends Library {
  def bookId: Int
  def bookDetails: String
}