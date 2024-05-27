<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>이벤트 목록</title>
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;700&display=swap"
	rel="stylesheet">
<style>
body {
   font-family: '맑은 고딕', 'Malgun Gothic', Arial, sans-serif;
   margin: 0;
   padding: 0;
   background-color: #f4f4f4;
}

header {
   background-color: #333;
   color: #fff;
   text-align: center;
   padding: 1em;
}

main {
   margin: 20px;
} 

.event {
   border: 1px solid #ddd;
   background-color: #fff;
   margin-bottom: 20px;
   padding: 15px;
   border-radius: 5px;
   display: flex;
   flex-direction: row;
}

h2 {
   margin-top: 20px;
   color: #333;
}

.event-text {
   margin-left: 30px;
   flex: 1;
}

p {
   margin-top: 10px;
   color: #666;
}

.event img {
   width: 200px;
   height: 130px;
   border-radius: 5px;
   margin-bottom: 10px;
}

a {
   
   color: #007BFF;
   text-decoration: none;
   font-weight: bold;
}

a:hover {
   text-decoration: underline;
}
</style>
</head>
<body>
   <jsp:include page="../header.jsp" />

   <header>
      <h1>이벤트 목록</h1>
   </header>

   <main>
      <div class="event">
         <a href="../event/event_page3.jsp"><img src="../resources/images/겨울섬mini.png" alt="이벤트 1 이미지"></a>
         <div class="event-text">
            <a href="../event/event_page3.jsp"><h2>2023 찾아가고 싶은 겨울X섬 인증샷 이벤트</h2></a>
            <p>2023. 12. 1.~2024. 2. 4.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page2.jsp"><img src="../resources/images/랭킹전.png" alt="이벤트 2 이미지"></a>
         <div class="event-text">
            <a href="../event/event_page2.jsp"><h2>발도장-콕 이벤트 12월 특별편 (feat.랭킹전)</h2></a>
            <p>2023. 12. 6.~2023. 12. 17.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page1.jsp"><img src="../resources/images/event_img11.png" alt="이벤트 3 이미지"></a>
         <div class="event-text">
            <a href="../event/event_page1.jsp"><h2>디지털 관광주민증과 함께 여행이 있는 주말, 혜택 더 있는 주말!</h2></a>
            <p>2023. 12. 1.~2024. 2. 4.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page6.jsp"><img src="../resources/images/트리2.png" alt="이벤트 4 이미지"></a>
         <div class="event-text">
            <a href="../event/event_page6.jsp"><h2>크리스마스 축제 기간 응모 이벤트!</h2></a>
            <p>2023. 12. 23.~2023. 12. 25.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page3.jsp"><img src="../resources/images/겨울섬mini.png" alt="이벤트 1 이미지"></a>
         <div class="event-text">
            <a href="../event/event_page3.jsp"><h2>2023 찾아가고 싶은 겨울X섬 인증샷 이벤트</h2></a>
            <p>2023. 12. 1.~2024. 2. 4.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page2.jsp"><img src="../resources/images/랭킹전.png" alt="이벤트 2 이미지"></a>
         <div class="event-text">
            <a href="../event/event_page2.jsp"><h2>발도장-콕 이벤트 12월 특별편 (feat.랭킹전)</h2></a>
            <p>2023. 12. 6.~2023. 12. 17.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page1.jsp"><img src="../resources/images/event_img11.png" alt="이벤트 3 이미지"></a>
         <div class="event-text">
            <a href="../event/event_page1.jsp"><h2>디지털 관광주민증과 함께 여행이 있는 주말, 혜택 더 있는 주말!</h2></a>
            <p>2023. 12. 1.~2024. 2. 4.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page6.jsp"><img src="../resources/images/트리2.png" alt="이벤트 4 이미지"></a>
         <div class="event-text">
            <a href="../event/event_page6.jsp"><h2>크리스마스 축제 기간 응모 이벤트!</h2></a>
            <p>2023. 12. 23.~2023. 12. 25.</p>
         </div>
      </div>
      

      <!-- 다른 이벤트들도 유사하게 추가할 수 있습니다. -->

   </main>
   <jsp:include page="../footer.jsp" />
</body>
</html>