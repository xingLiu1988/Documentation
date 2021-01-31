import React, {useState} from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';
function App() {
  
  const [loading, setLoading] = useState(false);
  const [image, setImage] = useState('');


  const uploadImage = e => {
    const files = e.target.files;
    console.log(files)
    const data = new FormData();
    data.append('file', files[0]);
    data.append('upload_preset', 'title_img');
    setLoading(true);
    axios.post('https://api.cloudinary.com/v1_1/meiguojobs/image/upload', data)
    .then(res => {
      console.log(res.data)
      setImage(res.data.secure_url);
      setLoading(false);
    })
  }

  return (
    <div className="App">
      <h1>上传图片案例</h1>
      <hr/>
      <form> 
        <input type="file" name="file" placeholder='upload an image' onChange={uploadImage}/>
      </form>
      {
        loading? (
          <h3>loading ... </h3>
        ): (
          <img src={image} style={{width:'300px'}} />
        )
      }
    </div>
  );
}

export default App;