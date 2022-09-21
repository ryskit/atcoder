use proconio::input;
#[proconio::fastout]
fn main() {
    input! {
        n:i32,
        xy:[[usize;2];n],
        q:i32,
        abcd:[(usize,usize,usize,usize);q],
    }
    let max = &xy.iter().flatten().max().unwrap_or(&0);
    let mut v = vec![vec![0;*max+1];*max+1];
    for i in &xy{
        v[i[0]][i[1]] += 1;
    }
    let mut sum = vec![vec![0;*max+2];*max+2];
    for i in 0..*max+1{
        for j in 0..*max+1{
            sum[i+1][j+1] = sum[i+1][j] + v[i][j];
        }
    }
    for i in 0..*max+1{
        for j in 0..*max+1{
            sum[i+1][j+1] += sum[i][j+1];
        }
    }
    for (a,b,c,d) in abcd{
        println!("{}",sum[c+1][d+1]-sum[c+1][b]-sum[a][d+1]+sum[a][b]);
    }
}
