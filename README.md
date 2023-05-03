api

사용자 등록 : /api/members | post
사용자 삭제 : /api/members/{id} | delete
도서 대출 : /api/books/{id}/loan | post
도서 반납 : /api/books/{id} | patch
사용자의 대출 히스토리 조회 : /api/members/{id}/history | get
도서 검색 : /api/books?page={num}& | get

User
    id
    name
    phone

Book
    id
    title
    author
    quantity
    library

Loan
    id
    userId
    bookId
    status
    loanDate
    returnDate

Library
    id
    name
    
    
    