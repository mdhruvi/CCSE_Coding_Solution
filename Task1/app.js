document.addEventListener('DOMContentLoaded', () => {
    const blogContainer = document.getElementById('blog-container');
  
    // Fetch posts from the JSONPlaceholder API
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(posts => {
        // Render blog cards
        posts.forEach(post => {
          const blogCard = createBlogCard(post);
          blogContainer.appendChild(blogCard);
        });
      })
      .catch(error => console.error('Error fetching posts:', error));
  
    // Function to create a blog card
    function createBlogCard(post) {
      const blogCard = document.createElement('div');
      blogCard.classList.add('blog-card');
  
      blogCard.innerHTML = `
        <h2>${post.title}</h2>
        <p>${post.body}</p>
        <button class="delete-btn" data-id="${post.id}">Delete</button>
      `;
  
      // Add click event listener to delete button
      const deleteBtn = blogCard.querySelector('.delete-btn');
      deleteBtn.addEventListener('click', () => deletePost(post.id));
  
      return blogCard;
    }
  
    // Function to delete a post
    function deletePost(postId) {
      // Make DELETE request to the JSONPlaceholder API
      fetch(`https://jsonplaceholder.typicode.com/posts/${postId}`, {
        method: 'DELETE',
      })
        .then(response => response.json())
        .then(() => {
          // Remove the deleted post from the UI
          const deletedCard = document.querySelector(`[data-id="${postId}"]`).parentNode;
          blogContainer.removeChild(deletedCard);
        })
        .catch(error => console.error('Error deleting post:', error));
    }
  });
  