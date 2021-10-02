    // HTML SELECTORS

    const quote = document.querySelector("#quote")   ;
    const author = document.querySelector("#author");
    const neQuote = document.querySelector("#nquote");
    const tweetBtn = document.querySelector("#tet");
    const loader = document.querySelector(".loader");
    const quoteContainer = document.querySelector(".quote-container")

        console.log(loader);
async function getQuote() {
    loading();
    // JAVASCRIPT 
    const apiUrl ="https://api.quotable.io/random";
    try {
        const response = await fetch(apiUrl);
        const data = await response.json();
        quote.innerHTML = data.content;
        author.innerHTML = '-' + data.author;
        
        // REDUCE
        if(data.content.length>50) {
            quote.classList.add("long-text");
        }else{
            quote.classList.remove("long-text");
        }    
        
        complete();
    } catch (error) {
        getQuote();
        console.log("whoops!",error);
        
    }

}
getQuote();

// Tweet
function tweetQuote () {
    const quotes =  quote.innerText;
    const authors =  quote.innerText;
    const twitterURL = `https://twiter.com/intent/tweet?text=${quotes} - ${authors}`;
    window.open(twitterURL,"_blank");

}

 
// EVENTS
neQuote.addEventListener("click",getQuote);
tweetBtn.addEventListener("click",tweetQuote);


// Loader show
function loading () {
    loader.hidden = false;
    quoteContainer.hidden = true;
}


// Loader hide
function complete() {
    if(!loader.hidden) {
        quoteContainer.hidden = false;
        loader.hidden = true;
    }
}
    